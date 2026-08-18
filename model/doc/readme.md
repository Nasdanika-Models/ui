```drawio-resource
../ui.drawio
```

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of **functional (logical) user interface**: what is on the screen, how it is arranged, what data it is bound to, what events it raises - and, because of where it sits in the tower, who owns it, what stage of its life it is in, what work is open on it, what controls apply to it, and why it was decided this way. Defined in [`ui.xcore`](ui.xcore).

It is deliberately *not* a rendering model. There are no pixels, no breakpoints, no shadows, no design tokens. [`Element`](references/eClassifiers/Element/index.html) carries `attributes`, `styleClasses`, and an inline `style` as escape hatches to the target markup, and stops there. Presentation belongs to a profile - the [Bootstrap UI model](https://bootstrap.models.nasdanika.org/) - and behavior belongs to a binding provider - the [Alpine.js model](https://alpinejs.models.nasdanika.org/). The core defines the vocabulary, not its execution.

The model sits on top of the [threat model](https://threat.models.nasdanika.org/) and therefore on the whole tower beneath it: [architecture](https://architecture.models.nasdanika.org/), [work](https://work.models.nasdanika.org/), [governance](https://governance.models.nasdanika.org/), [decision binding](https://DecisionBinding.models.nasdanika.org/), [decision analysis](https://DecisionAnalysis.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), [IAM](https://iam.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), [nxcore](https://nxcore.models.nasdanika.org/). See [Nasdanika Models](https://nasdanika.com/models.html) for the full picture.

## The thesis

Pixel perfection is the wrong thing to optimize when an organization has already agreed on its UI elements.

If the button, the card, the form field, and the modal are settled - approved, versioned, themed, accessible, shipped in a design system - then re-drawing them at full fidelity in a design tool produces a picture of something that already exists. What is *not* settled, and what the picture cannot express, is the part that actually decides whether the screen works:

* the **layout** - what contains what, in what order, in what direction;
* the **data binding** - where the value in that field comes from and where it goes;
* the **event binding** - what happens on click, on input, on submit;
* the **structure** - what repeats per item, what appears only under a condition, what scope the data lives in;
* the **documentation** - what this screen is for, what the field means, what the edge cases are;
* the **provenance** - who approved this element, what stage it is in, what risks it carries, what work is open on it.

Those are all data. They are also all things a design file loses on export and a screenshot never had. This model makes them the primary content and treats appearance as a downstream concern.

## Competitive landscape

**Design tools: Figma, Sketch, Penpot, Adobe XD.** The incumbents, and genuinely excellent at what they do - visual exploration, high-fidelity comps, design systems as component libraries, developer-handoff specs, and increasingly prompt-to-design generation. Their unit of truth is a *frame*: geometry, fills, and text. Bindings are absent; a prototype link is a wire between frames, not an expression over a data scope. Documentation lives in comment threads and adjacent wiki pages. And the deliverable is a *handoff* - the moment where the design stops being the source of truth and the code starts, after which the two drift. Where an approved element set already exists, the fidelity these tools are best at is the part that matters least.

**Low-code and app platforms: OutSystems, Mendix, Power Apps, Appian, Retool, Budibase.** The closest competitors on substance, because they do model layout, data binding, and events declaratively - which is the right idea. The cost is that the model is theirs. Proprietary schema, proprietary runtime, per-app or per-seat pricing, an editor you cannot drive from outside, and no path to compose the UI model with an architecture model, a risk register, or a backlog. Binding without ownership, and a migration story that is a rewrite.

**Declarative UI frameworks and DSLs: SwiftUI, Jetpack Compose, Flutter, QML, XAML, JSX, Vaadin, Thymeleaf, HTMX, Alpine.js, Web Components.** Each is an excellent logical-UI language for exactly one runtime. They are the *targets* of this model, not its rivals: [`Custom`](references/eClassifiers/Custom/index.html) maps to a custom element name, [`Iterator`](references/eClassifiers/Iterator/index.html) to `x-for`, [`Conditional`](references/eClassifiers/Conditional/index.html) to `x-if`, [`DataContext`](references/eClassifiers/DataContext/index.html) to `x-data`. What none of them provides is a representation that outlives the framework choice - and the framework choice is the thing that changes most often.

**Server-driven and agent-driven UI: Airbnb's Ghost Platform, Adaptive Cards, JSON Forms, [A2UI](https://a2ui.models.nasdanika.org/).** A fast-growing camp, and the reason this model matters more now than it did five years ago: when a language model emits the interface, "which components may it emit" becomes a security question rather than a style question. These are payload schemas - flat, streaming-friendly, versioned by the vendor - with a trusted catalog on the client and no typed answer to *pre-approved by whom, at what risk, until when*. The Nasdanika [A2UI model](https://a2ui.models.nasdanika.org/) covers the protocol; this model is where the catalog's own semantics live.

**Model-driven UI standards: OMG's IFML, UML, WebRatio, and the EMF UI-generator lineage.** The nearest prior art in intent - IFML is explicitly a platform-independent interaction-flow model - and the clearest cautionary tale. Thin tooling, near-single-vendor implementation, a notation heavy enough that adoption stalls at the diagram, and no composition with the surrounding enterprise models. The lesson taken here: stay micro, stay text-first, and earn value by *composing* with models an organization already has rather than by covering the UI domain exhaustively.

**Component catalogs and Storybook.** Storybook documents components well - as code, per framework, per repository. It answers "what does this component look like in these states" and does not attempt "what screens exist across the estate, which of them use this component, and what breaks if we deprecate it". That question is a query over a model.

**The actual competitor**, as everywhere else in the tower: a screenshot pasted into a wiki page, a design-tool link that no longer matches production, and a ticket describing the difference in prose.

## What a typed model adds

**Elements are governed, not just drawn.** [`Element`](references/eClassifiers/Element/index.html) extends nxcore `ModelElement`, `Workable`, and `Governed`. That is not decoration: an approved element carries applied controls with evidence (accessibility conformance, a security review, a privacy sign-off), risks, waivers, and the open work items against it - as structure, queryable across every model in the tower at once. With the lifecycle and role aspects joining on classpath convergence (`Staged`, `Undergoer`), an element also carries dated stage occupancy and role assignments: who authored it, who owns it, who approved it, when it entered `deprecated`, and when support ends. Because nxcore `ModelElement` is `Documented` and `Marked`, every element already has inline documentation, documentation sections, and source markers.

**Bindings are dialect-neutral vocabulary.** [`ValueBinding`](references/eClassifiers/ValueBinding/index.html) (with `ONE_WAY` / `TWO_WAY` / `ONE_TIME` [modes](references/eClassifiers/BindingMode/index.html)), [`EventBinding`](references/eClassifiers/EventBinding/index.html), [`Iterator`](references/eClassifiers/Iterator/index.html), [`Conditional`](references/eClassifiers/Conditional/index.html), and [`DataContext`](references/eClassifiers/DataContext/index.html) say *what* is bound; expressions are strings interpreted or translated by a binding provider model. The same screen renders to Alpine.js today and to something else in three years without touching the layout, the documentation, or the governance record.

**Extension without metamodel change.** [`Custom`](references/eClassifiers/Custom/index.html) is the open door: an element with a `kind` that maps to a web-components custom element name and participates in [capability](https://docs.nasdanika.org/core/capability/index.html)-framework service resolution at generation time. New element kinds are added by registering capabilities, not by releasing a new metamodel. The metamodel stays micro on purpose.

**Structure is real structure.** [`Fragment`](references/eClassifiers/Fragment/index.html) renders nothing of its own and exists to group children and host structural bindings - the template element of the model. [`Component`](references/eClassifiers/Component/index.html), [`Include`](references/eClassifiers/Include/index.html), and [`Slot`](references/eClassifiers/Slot/index.html) give reuse, arguments, and content projection. Because `Include` references rather than copies, a component published by one team as a Maven artifact is used by another team's [`UiDomain`](references/eClassifiers/UiDomain/index.html) with the reference intact - so "who uses this component" and "what breaks if we retire it" are queries rather than a survey.

**Standards-aware where it counts.** [`Button.command` / `commandFor`](references/eClassifiers/Button/index.html) follow the [Open UI](https://open-ui.org/) invoker-commands direction, and [`Select`](references/eClassifiers/Select/index.html) is informed by customizable select: declarative behavior the platform itself is standardizing, modeled as data rather than as a handler string.

**Federation over centralization.** `UiDomain` federates by reference like every other Nasdanika domain. An organization's UI model is the union of the models its teams publish, not a system everyone has to log into.

## Applications

**Governed design systems.** The originating case. An organization's approved element catalog becomes a model: each element documented, staged (`proposed` to `approved` to `deprecated`), owned via role assignments, carrying its accessibility and security controls with evidence. Deprecating a component becomes an impact query rather than an email.

**Functional specification that survives handoff.** A screen modeled as layout plus bindings plus documentation is a specification a developer can implement, a generator can emit, and a reviewer can diff. Attach it to [`Work`](https://work.models.nasdanika.org/references/eClassifiers/Work/index.html) and the traceability from backlog item to screen element is structural rather than a link in a description field.

**Generation to multiple targets.** HTML plus Alpine.js, the Bootstrap profile, web components, or a framework not yet chosen. The [html](https://github.com/Nasdanika/html) and [html-app](https://github.com/Nasdanika-Models/html-app) stacks are the near-term rendering path; the capability framework is how new ones plug in.

**Validating agent-generated UI.** When an agent emits an interface, the catalog says what it may emit and the model says whether what it emitted is structurally valid, uses only approved kinds, and binds only to permitted data scopes - before anything reaches a browser. Pairs with the [A2UI model](https://a2ui.models.nasdanika.org/) on the protocol side.

**Threat modeling the interface.** The dependency on the [threat model](https://threat.models.nasdanika.org/) is not incidental: [`TextInput`](references/eClassifiers/TextInput/index.html), [`FileInput`](references/eClassifiers/FileInput/index.html), and [`Form`](references/eClassifiers/Form/index.html) are entry points, an `Include` of a federated component is a supply-chain edge, and a `DataContext` expression is a data flow crossing a trust boundary. A modeled UI makes the attack surface enumerable instead of imagined.

**Recorded framework decisions.** Which rendering profile, which binding dialect, which component library - captured in the [decision analysis](https://DecisionAnalysis.models.nasdanika.org/) and [decision binding](https://DecisionBinding.models.nasdanika.org/) models as variation points bound to alternatives, so the choice and its rationale outlive the people who made it.

**Modernization.** Legacy interfaces reverse-engineered into a neutral model - structure and bindings recovered, presentation discarded - then regenerated onto a current stack. The same posture the tower takes elsewhere with [Visio](https://github.com/Nasdanika-Models/visio), [PowerPoint](https://github.com/Nasdanika-Models/power-point), and integration-platform models.

**Documentation sites.** Generate the catalog site itself: element reference pages, usage examples, ownership, stage badges, and the risks and controls attached - with the same generation stack that produced this page.

## Model overview

| Area | Types |
|------|-------|
| Base | [Element](references/eClassifiers/Element/index.html) (`attributes`, `styleClasses`, `style`, `bindings`; `ModelElement` + `Workable` + `Governed`), [Container](references/eClassifiers/Container/index.html) |
| Bindings | [Binding](references/eClassifiers/Binding/index.html), [ValueBinding](references/eClassifiers/ValueBinding/index.html), [EventBinding](references/eClassifiers/EventBinding/index.html), [Iterator](references/eClassifiers/Iterator/index.html), [Conditional](references/eClassifiers/Conditional/index.html), [DataContext](references/eClassifiers/DataContext/index.html), [BindingMode](references/eClassifiers/BindingMode/index.html) |
| Structure | [Fragment](references/eClassifiers/Fragment/index.html), [Custom](references/eClassifiers/Custom/index.html) (`kind`, capability-resolved), [Component](references/eClassifiers/Component/index.html), [Include](references/eClassifiers/Include/index.html), [Slot](references/eClassifiers/Slot/index.html) |
| Layouts | [Layout](references/eClassifiers/Layout/index.html), [Stack](references/eClassifiers/Stack/index.html) ([Orientation](references/eClassifiers/Orientation/index.html), `gap`), [Grid](references/eClassifiers/Grid/index.html), [Tabs](references/eClassifiers/Tabs/index.html), [Tab](references/eClassifiers/Tab/index.html) |
| Display | [Text](references/eClassifiers/Text/index.html), [Image](references/eClassifiers/Image/index.html), [Link](references/eClassifiers/Link/index.html), [Button](references/eClassifiers/Button/index.html) (`command`, `commandFor`) |
| Input | [Input](references/eClassifiers/Input/index.html), [TextInput](references/eClassifiers/TextInput/index.html) ([TextKind](references/eClassifiers/TextKind/index.html)), [TextArea](references/eClassifiers/TextArea/index.html), [Checkbox](references/eClassifiers/Checkbox/index.html), [Select](references/eClassifiers/Select/index.html), [RadioGroup](references/eClassifiers/RadioGroup/index.html), [Option](references/eClassifiers/Option/index.html), [Slider](references/eClassifiers/Slider/index.html), [DateInput](references/eClassifiers/DateInput/index.html) ([DateKind](references/eClassifiers/DateKind/index.html)), [FileInput](references/eClassifiers/FileInput/index.html), [Form](references/eClassifiers/Form/index.html) |
| Root | [UiDomain](references/eClassifiers/UiDomain/index.html) (`components`, `elements`; federates by reference) |
| Reused, not redefined | nxcore `ModelElement` / `Documented` / `Marked` / `StringToStringMapEntry`, governance `Governed`, work `Workable`; lifecycle `Staged` and role `Undergoer` pending classpath convergence |

## Relation to other Nasdanika work

**Profiles and providers.** The [Bootstrap UI model](https://bootstrap.ui.models.nasdanika.org/) extends this model with a presentation profile - pages, rows and columns, cards, modals, navbars, alerts, badges, spinners, toasts, themed variants. 

**The tower.** Aspects come from below and are not re-invented here: identity, documentation, and markers from [nxcore](https://nxcore.models.nasdanika.org/); roles and actors from [role](https://role.models.nasdanika.org/); stages and sojourns from [lifecycle](https://lifecycle.models.nasdanika.org/); subjects and access control from [IAM](https://iam.models.nasdanika.org/); signatures from [seal](https://seal.models.nasdanika.org/); controls, risks, and evidence from [governance](https://governance.models.nasdanika.org/); work items and dependencies from [work](https://work.models.nasdanika.org/); elements and relationships from [architecture](https://architecture.models.nasdanika.org/); assets, flows, and trust boundaries from [threat](https://threat.models.nasdanika.org/).

**Tooling.** Models are authored in [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) or as XMI/YAML/JSON or diagrammed with the [Drawio model](https://drawio.models.nasdanika.org/) with fine-grained details in external files, and documented with the same generation stack that built this site.
