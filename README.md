<div align="center">

# 🧵 Java Multi-Threading

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Multi-Threading?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Multi-Threading/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Multi-Threading?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Multi-Threading/network/members)
[![GitHub issues](https://img.shields.io/github/issues/Shubh2-0/Multi-Threading?style=for-the-badge&logo=github&color=red)](https://github.com/Shubh2-0/Multi-Threading/issues)

<img src="https://miro.medium.com/max/1400/1*N39cN0r6Bhs-MFcZe4nWDg.png" alt="Multi-Threading" width="500"/>

### Master Concurrent Programming in Java

*Maximize CPU utilization with threads, synchronization, and parallel execution*

[Concepts](#-concepts) · [Examples](#-examples) · [Get Started](#-getting-started)

</div>

---

## 📖 Table of Contents

- [About](#-about)
- [Concepts](#-concepts)
- [Thread Lifecycle](#-thread-lifecycle)
- [Examples](#-examples)
- [Technologies](#-technologies)
- [Getting Started](#-getting-started)
- [Contact](#-contact)

---

## 🎯 About

**Multithreading** is a Java feature that allows concurrent execution of two or more parts of a program for maximum CPU utilization. This repository covers everything from thread basics to advanced synchronization techniques.

### Why Multithreading?

- ⚡ **Performance** - Utilize multiple CPU cores
- 🔄 **Responsiveness** - Keep UI responsive during heavy tasks
- 📊 **Efficiency** - Better resource utilization
- 🎯 **Parallelism** - Execute multiple tasks simultaneously

---

## 💡 Concepts

| Concept | Description |
|---------|-------------|
| **Thread** | Lightweight process, smallest unit of execution |
| **Runnable** | Interface for creating threads |
| **Synchronized** | Prevent race conditions |
| **Deadlock** | Circular wait condition |
| **Thread Pool** | Reusable thread collection |
| **Executor** | Framework for thread management |

---

## 🔄 Thread Lifecycle

```
                    ┌─────────────────────────────────────────┐
                    │                                         │
                    ▼                                         │
┌──────────┐    ┌──────────┐    ┌──────────┐    ┌──────────┐ │
│   NEW    │───►│ RUNNABLE │───►│ RUNNING  │───►│TERMINATED│ │
└──────────┘    └──────────┘    └────┬─────┘    └──────────┘ │
     │              ▲                │                        │
     │              │                ▼                        │
     │              │         ┌──────────┐                    │
     │              └─────────│ BLOCKED/ │                    │
     │                        │ WAITING  │                    │
     │                        └──────────┘                    │
     │                                                        │
     └────────────────────────────────────────────────────────┘
```

---

## 📚 Examples

### Creating Threads

```java
// Method 1: Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + getName());
    }
}

// Method 2: Implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running");
    }
}

// Method 3: Lambda Expression (Java 8+)
Thread t = new Thread(() -> System.out.println("Lambda thread"));
```

### Synchronization

```java
class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}
```

---

## 🛠️ Technologies

<div align="center">

| Technology | Purpose |
|:----------:|:-------:|
| <img src="https://skillicons.dev/icons?i=java" width="50"/> | Java 8+ |
| <img src="https://skillicons.dev/icons?i=eclipse" width="50"/> | Eclipse IDE |
| <img src="https://skillicons.dev/icons?i=idea" width="50"/> | IntelliJ IDEA |

</div>

---

## 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/Shubh2-0/Multi-Threading.git
cd Multi-Threading

# Open in your IDE
# Run the examples and experiment!
```

---

## 📬 Contact

<div align="center">

**Shubham Bhati** - Java Developer

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)
[![WhatsApp](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://wa.me/+916232133187)

</div>

---

<div align="center">

### ⭐ Star this repository to support multithreading learning!

**Keywords:** Java Multithreading Concurrency Thread Synchronization Deadlock Runnable Executor Thread-Pool Parallel-Programming

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=60&section=footer"/>

</div>
