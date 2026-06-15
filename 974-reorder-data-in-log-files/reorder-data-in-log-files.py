class Solution:

    def reorderLogFiles(self, logs: list[str]) -> list[str]:
        def sort_key(log: str):
            identifier, content = log.split(" ", 1)

            if content[0].isalpha():
                return (0, content, identifier)

            return (1,)

        return sorted(logs, key=sort_key)
