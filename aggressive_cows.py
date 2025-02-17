#AGGRESSIVE COWS PROBLEM

def isPossible(stalls, k, minDist):
    count = 1
    last_pos = stalls[0]

    for i in range(1, len(stalls)):
        if stalls[i] - last_pos >= minDist:
            count += 1
            last_pos = stalls[i]
            if count == k:
                return True

    return False

def aggressiveCows(stalls, k):
    stalls.sort()

    low, high = 1, stalls[-1] - stalls[0]
    best = 0

    while low <= high:
        mid = (low + high) // 2
        if isPossible(stalls, k, mid):
            best = mid
            low = mid + 1
        else:
            high = mid - 1

    return best

stalls1 = [1, 2, 4, 8, 9]
k1 = 3
print(aggressiveCows(stalls1, k1))

stalls2 = [10, 1, 2, 7, 5]
k2 = 3
print(aggressiveCows(stalls2, k2))

stalls3 = [2, 12, 11, 3, 26, 7]
k3 = 5
print(aggressiveCows(stalls3, k3))
