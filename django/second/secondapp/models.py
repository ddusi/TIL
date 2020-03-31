from django.db import models

# Create your models here.

class shop1(models.Model):
    name = models.CharField(max_length=100)
    desc = models.CharField(max_length=100)
    rest_date = models.CharField(max_length=100)
    parking_info = models.CharField(max_length=100)
    img_path = models.CharField(max_length=225)
    
