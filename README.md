# FCFS Disk Scheduling Algorithm

A simple Python program that demonstrates the First-Come, First-Served (FCFS) disk scheduling algorithm.

## Features
- Processes disk requests in order
- Calculates total seek distance
- Calculates average seek distance

## How to Run

Make sure Python is installed, then run:

```bash
python filename.py
```

Replace `filename.py` with your Python file name.

## Example Input

```python
head = 50
requests = [98, 183, 37, 122, 14, 124, 65, 67]
```

## Sample Output

```text
FCFS I/O DISK SCHEDULING by FLORES and FRANCISCO
Initial head position         : 50
Request queue                 : [98, 183, 37, 122, 14, 124, 65, 67]

Service order                 : 50 -> 98 -> 183 -> 37 -> 122 -> 14 -> 124 -> 65 -> 67
Total seek distance           : 643 cylinders
Average seek                  : 80.38 cylinders/request
```

## Concepts Used
- FCFS Disk Scheduling
- Python Functions
- Lists and Loops

## Authors
- Flores
- Francisco