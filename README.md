## Haiku Checker

Haiku is an ancient form of Japanese poetry. A haiku is a three-line poem with seventeen syllables, where the first line must contain five syllables, the second line must contain seven syllables, and the third line must contain five syllables. The lines do not have to rhyme. Here is an example where slashes separate the lines:
Computer programs/The bugs try to eat my code/I must not let them.

Your job is to determine whether each line has the correct number of syllables (5/7/5).
For the purposes of this problem, every contiguous sequence of one or more vowels counts as one syllable, where the vowels are a, e, i, o, u, and y.
Every word will contain at least one syllable.
This method of counting syllables has to agree with English conventions.
In the second example below, your program must consider the word "code" to have one syllable despite the fact that "o" and the "e" are not consecutive. In English, the "e" is silent so "code" actually has only one syllable.

Examples:
```
Input                                                                        Output

happy purple frog/eating bugs in the marshes/get indigestion computer        5,7,8,No

i hack good programs/yes, bugs try to eat my code/i will not let them        5,7,5,Yes
```