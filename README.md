# feed-generator

The problem is divided into 4 parts :

1. Post Generator Service (Creates random posts on the basis of the capacity)

2. Ranking Service (It assigns a ranking to the posts based on the number of likes, comments, and shares)

3. Sorting Service (Sorting service sorts the posts based on the ranking and it also separates out the boosted posts in a different queue)

4. Merging Service (Merging service then merges the feed on the basis of boosted posts and non-boosted posts and displays them on the console)

For simplicity I have kept the capacity to 10 for creating random posts and on every interval of 5 I have inserted the boosted posts into the user's feed
