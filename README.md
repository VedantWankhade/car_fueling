# car_fueling
Program to find minimum number of fuel stops that can be made by a car 

##**Problem Introduction**

You are going to travel to another city that is located d miles away from your home city. Your car can travel

at most m miles on a full tank and you start with a full tank. Along your way, there are gas stations at

distances stop 1 , stop 2 , . . . , stop n from your home city. What is the minimum number of refills needed?

##**Problem Description**

**Input Format:** The first line contains an integer d. The second line contains an integer m. The third line

specifies an integer n. Finally, the last line contains integers stop 1 , stop 2 , . . . , stop n .

**Output Format:** Assuming that the distance between the cities is d miles, a car can travel at most m miles

on a full tank, and there are gas stations at distances stop 1 , stop 2 , . . . , stop n along the way, output the

minimum number of refills needed. Assume that the car starts with a full tank. If it is not possible to

reach the destination, output −1.

**Constraints:** 1 ≤ d ≤ 10 5 . 1 ≤ m ≤ 400. 1 ≤ n ≤ 300. 0 < stop 1 < stop 2 < · · · < stop n < d.

**Sample 1:

Input:**

```
950

400

4

200 375 550 750
```

**Output:**

```
2
```
The distance between the cities is 950, the car can travel at most 400 miles on a full tank. It suffices

to make two refills: at points 375 and 750. This is the minimum number of refills as with a single refill

one would only be able to travel at most 800 miles.

**Sample 2:

**Input:**

```
10

3

4

1259
```

**Output:**

```
-1

```
One cannot reach the gas station at point 9 as the previous gas station is too far away.

**Sample 3:

**Input:**

```
200

250

2

100

150

```
**Output:**

```
0
```

There is no need to refill the tank as the car starts with a full tank and can travel for 250 miles

whereas the distance to the destination point is 200 miles.
