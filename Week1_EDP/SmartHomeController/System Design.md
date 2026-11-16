# Event-Driven System Design
## System Name: Smart Home Controller

## Part 1: Event Sources
1. Lights Toggle - Generates click events when toggled ON/OFF[cite: 34, 35]
2. Security Toggle - Generates click events to ARM/DISARM[cite: 34, 35, 36]
3. Door Sensor Button - Generates click events when a door is opened[cite: 34, 36]

## Part 2: Events
| Event Name | Source | Description |
| --- | --- | --- |
| LightsToggled | Lights Toggle | User clicks to turn lights on or off[cite: 35] |
| SecurityToggled | Security Toggle | User arms or disarms the security system[cite: 36] |
| DoorOpened | Door Sensor Button | User simulates opening a door[cite: 36] |

## Part 3: Event Handlers
| Event | Handler Action |
| --- | --- |
| LightsToggled | Updates button text, logs event, changes status label[cite: 35] |
| SecurityToggled | Updates security status, logs system state change[cite: 36] |
| DoorOpened | Checks security state; triggers alarm if armed, or logs normal entry if disarmed[cite: 36] |

## Part 4: Event Flow Diagram
User Action → Event Source → Event Object → Event Queue → Event Loop Handler → GUI Update[cite: 33]

## Part 5: Potential Issues
1. UI Freezing - Prevented by keeping heavy tasks off the EDT.
2. False Alarms - Prevented by validating system arm status before triggering the siren.
