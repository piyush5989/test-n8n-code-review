# test-n8n-code-review

Sample repo to test AI code review capabilities (n8n workflow + Cursor).

## Project layout

- **main**: Minimal Java dummy project (Maven, `Main`, `Calculator`).
- **feature/sample-for-ai-review**: Same base + `UserService` and a change in `Main` with **intentional issues** so the AI reviewer has concrete feedback to give.

## How to test the AI reviewer

1. **Push both branches** (if not already):
   ```bash
   git push -u origin main
   git push -u origin feature/sample-for-ai-review
   ```

2. **Open a PR** on GitHub: base `main` ← compare `feature/sample-for-ai-review`.

3. **Run your n8n code-review workflow** (triggered by the PR, or run manually if your workflow is set up for this repo).

4. **Check the PR** for the AI-generated review comment (readability, security, maintainability, inline-style suggestions).


## Intentional issues in `feature/sample-for-ai-review`

These are included so the AI has clear things to comment on:

| File / area | Intended review targets |
|-------------|--------------------------|
| `UserService.java` | Hardcoded DB credentials; SQL built with string concatenation (injection risk); vague names (`x`, `q`, `n`, `data`); no null check in `process(String)`; empty catch block; magic numbers. |
| `Main.java` | Passing `null` into `UserService.process()` (NPE risk). |

You can add more “bad” code on the same branch and push again to get a fresh diff for another review run.
