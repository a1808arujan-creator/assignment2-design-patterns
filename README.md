
# Assignment 2 — Factory Method & Abstract Factory

## Theme

Smart-Home Hub

This project demonstrates two creational design patterns:
Factory Method and Abstract Factory.

## Part A — Factory Method

The Factory Method part creates individual smart-home devices.

The Product interface is `Device`.

Concrete products:
- `Lamp`
- `Thermostat`
- `SmartCamera`

The abstract creator is `DeviceCreator`. It declares the `createDevice()` factory method and contains the `testDevice()` business method.

Concrete creators:
- `LampCreator`
- `ThermostatCreator`
- `CameraCreator`

Each concrete creator decides which concrete device to instantiate.
The client does not instantiate concrete devices directly.

## Part B — Abstract Factory

The Abstract Factory part creates families of compatible smart-home products.

Abstract products:
- `Sensor`
- `Controller`
- `MobileApp`

The abstract factory interface is `SmartHomeFactory`.

Concrete factories:
- `NovaFactory`
- `OrionFactory`

`NovaFactory` creates:
- `NovaSensor`
- `NovaController`
- `NovaApp`

`OrionFactory` creates:
- `OrionSensor`
- `OrionController`
- `OrionApp`

The `SmartHomeClient` receives a `SmartHomeFactory` through its constructor and works with product interfaces instead of concrete product classes.

The product family is selected in one place in `Main`.

## Factory Method vs Abstract Factory

Factory Method creates one type of product and mainly relies on inheritance. Concrete creator subclasses override the factory method and decide which concrete product to create.

Abstract Factory creates a family of related products and mainly relies on composition. The client receives a factory object and uses it to create a compatible family of products.

## SOLID Principles

### Open/Closed Principle

The Factory Method design allows new device types to be added by creating new product and creator classes without changing the existing product implementations.

### Single Responsibility Principle

Product classes are responsible for product behaviour, while creators and factories are responsible for object creation.

## Drawbacks

Factory Method can increase the number of classes because each new product may require a new creator subclass.

Abstract Factory makes adding a new family relatively easy. However, adding a new kind of product requires changing the abstract factory interface and all concrete factories.