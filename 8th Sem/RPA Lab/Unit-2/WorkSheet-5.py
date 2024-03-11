import numpy as np
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.metrics import accuracy_score, classification_report
import logging
import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

logging.basicConfig(filename='decision_making.log', level=logging.INFO)

iris = load_iris()
X = iris.data
y = iris.target

def preprocess_data(X):
    return X

def select_model():
    model = Sequential([
        Dense(10, input_shape=(4,), activation='relu'),
        Dense(3, activation='softmax')
    ])
    model.compile(optimizer='adam', loss='sparse_categorical_crossentropy', metrics=['accuracy'])
    return model

def train_model(model, X_train, y_train):
    model.fit(X_train, y_train, epochs=50, batch_size=8, verbose=0)

def make_decision(model, data):
    predictions = np.argmax(model.predict(data), axis=-1)
    return predictions

def handle_errors(exception):
    logging.error(str(exception))

def main():
    try:
        X_processed = preprocess_data(X)
        X_train, X_test, y_train, y_test = train_test_split(X_processed, y, test_size=0.2, random_state=42)
        scaler = StandardScaler()
        X_train = scaler.fit_transform(X_train)
        X_test = scaler.transform(X_test)
        model = select_model()
        train_model(model, X_train, y_train)
        predictions = make_decision(model, X_test)
        accuracy = accuracy_score(y_test, predictions)
        logging.info(f'Model accuracy: {accuracy}')
        logging.info(f'Classification report: {classification_report(y_test, predictions)}')
        results_df = pd.DataFrame({'Actual': y_test, 'Predicted': predictions})
        results_df.to_csv('decision_results_ann.csv', index=False)
        decision = "Accept" if accuracy > 0.8 else "Reject"
        print("Decision:", decision)
    except Exception as e:
        handle_errors(e)

if _name_ == "_main_":
    main()

    