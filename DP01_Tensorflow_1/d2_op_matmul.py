import tensorflow as tf

#construct the graph
matrix1 = tf.constant([[3., 3.]])
matrix2 = tf.constant([[2.],[2.]])
product=tf.matmul(matrix1,matrix2)

#excute the graph
with tf.Session() as sess:
    result = sess.run(product)
    print(result)