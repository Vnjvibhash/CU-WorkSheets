import pyautogui as pg
import  time
time.sleep(10)
for i in range(500):
    pg.write("https://drive.google.com/file/d/10GJi_SbGxFqaB1dasUVUOFFR_JXBEtbG/view?usp=sharing")
    pg.press('enter')
    time.sleep(2)