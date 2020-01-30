from django.db import models

# Create your models here.

class shop(models.Model):
    name = models.CharField(max_length=100)
    desc = models.CharField(max_length=100)
    rest_data = models.CharField(max_length=100)
    parking_info = models.CharField(max_length=100)
    imp_path = models.CharField(max_length=225)
