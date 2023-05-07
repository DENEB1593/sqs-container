    aws --endpoint-url=http://127.0.0.1:4566 sqs create-queue --queue-name post-event.fifo --attributes 'FifoQueue=true'
    aws --endpoint-url=http://127.0.0.1:4566 sqs list-queues