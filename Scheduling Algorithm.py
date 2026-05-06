def fcfs(requests: list[int], head: int) -> dict:
    sequence = []
    total_seek = 0
    current = head

    for request in requests:
        seek = abs(request - current)
        total_seek += seek
        sequence.append(request)
        current = request

    return {
        "order": sequence,
        "total_seek_distance": total_seek,
        "avg_seek": round(total_seek / len(requests), 2),
    }


if __name__ == "__main__":
    head = 50
    requests = [98, 183, 37, 122, 14, 124, 65, 67]
    print("FCFS I/O DISK SCHEDULING by FLORES and FRANCISCO")
    print(f"Initial head position         : {head}")
    print(f"Request queue                 : {requests}\n")
    result = fcfs(requests, head)
    print(f"Service order                 : {head} -> {' -> '.join(map(str, result['order']))}")
    print(f"Total seek distance           : {result['total_seek_distance']} cylinders")
    print(f"Average seek                  : {result['avg_seek']} cylinders/request")