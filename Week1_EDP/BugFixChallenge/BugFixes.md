# Bug Fix Documentation

## Bug 1: Blocking the EDT
- **Symptom:** UI freezes when button clicked[cite: 31]
- **Cause:** Long operation runs on EDT[cite: 31]
- **Fix:** Run operation in background thread, update UI on EDT[cite: 31]
- **Code Change:** Moved heavy work to a background thread so the screen stays awake.

## Bug 2: Missing Listener
- **Symptom:** Button click does nothing[cite: 31]
- **Cause:** No ActionListener registered[cite: 31]
- **Fix:** Added ActionListener to increment button[cite: 31]
- **Code Change:** Plugged in an action listener so clicking the button counts up.

## Bug 3: Wrong Thread
- **Symptom:** Erratic behavior, potential crashes[cite: 31]
- **Cause:** GUI updated from background thread[cite: 31]
- **Fix:** Used SwingUtilities.invokeLater() for GUI updates[cite: 31]
- **Code Change:** Safely updated the clock text on the main screen thread.

## Bug 4: Memory Leak
- **Symptom:** Memory usage grows over time[cite: 31]
- **Cause:** References kept in list after removal from UI[cite: 31]
- **Fix:** Clear the list when removing buttons[cite: 31]
- **Code Change:** Cleared out the storage list when deleting buttons.