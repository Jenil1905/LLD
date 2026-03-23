# Pen System

This is a simple system for a Pen implementing the strategy pattern based on the provided UML class diagram. It separates the pen's structure (like Click or Cap) and the pen's writing type (like BallPen or GelPen). The diagram below visualizes the relationships automatically.

```mermaid
classDiagram
    class Pen {
        -IType type
        -IStructure structure
        -InkType ink
        +write(text: string)
        +start()
        +stop()
        +refill(ink: InkType)
    }

    class IType {
        <<interface>>
        +write(text: string, ink: InkType)
        +refill(ink: InkType)
    }

    class IStructure {
        <<interface>>
        +start()
        +stop()
    }

    class InkType {
        +string color
        +refill(color: string)
        +setInk(color: string)
    }

    class BallPen {
        +write(text: string, ink: InkType)
        +refill(ink: InkType)
    }

    class GelPen {
        +write(text: string, ink: InkType)
        +refill(ink: InkType)
    }

    class Click {
        +start()
        +stop()
    }

    class Cap {
        +start()
        +stop()
    }

    Pen --> IType : uses
    Pen --> IStructure : uses
    Pen --> InkType : contains
    IType <|-- BallPen : implements
    IType <|-- GelPen : implements
    IStructure <|-- Click : implements
    IStructure <|-- Cap : implements
```

## Classes Explained

- **Pen**: The primary class taking an `IType`, `IStructure`, and `InkType`.
- **IType**: Determines the writing mechanism (e.g., `BallPen`, `GelPen`). 
- **IStructure**: Determines the structural mechanism to open or close the pen (e.g., `Click`, `Cap`).
- **InkType**: Represents the ink color and state.
