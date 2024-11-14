class Task {
        String name;
        String priority;

        Task(String name, String priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Task{" + "name='" + name + '\'' + ", priority='" + priority + '\'' + '}';
        }
    }
