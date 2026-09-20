import tensorflow as tf
from tensorflow import keras
import numpy as np

# Dataset
X = np.array([[0,0],
              [0,1],
              [1,0],
              [1,1]])

y = np.array([[0],[0],[0],[1]])

# Model with tuned hyperparameters
model = keras.Sequential([
    keras.layers.Dense(4, input_shape=(2,), activation='relu'),
    keras.layers.Dense(1, activation='sigmoid')
])

optimizer = keras.optimizers.Adam(learning_rate=0.01)

model.compile(
    optimizer=optimizer,
    loss='binary_crossentropy',
    metrics=['accuracy']
)

model.fit(X, y, epochs=200, batch_size=1)

pred = model.predict(X)
print((pred > 0.5).astype(int))