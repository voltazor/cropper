Circular Cropper
=======
The Cropper is an image cropping tool. It provides a way to set an image in XML and programmatically, and displays a resizable crop window on top of the image. Calling the method getCroppedImage() will then return the Bitmap marked by the crop window.

Developers can customize the following attributes (both via XML and programmatically):

- appearance of guidelines in the crop window
- whether the aspect ratio is fixed or not
- aspect ratio (if the aspect ratio is fixed)
- apply circular crop
- image resource

A public method to rotate the image by a specified number of degrees is also included. This can be used to provide the user with an option to fix the image orientation should Android miscalculate the intended orientation.

Forked from https://github.com/edmodo/cropper

For more information, see the linked Github Wiki page. 

https://github.com/edmodo/cropper/wiki

![ScreenShot](http://i.imgur.com/3FhsTgfl.jpg)

![ScreenShot](http://i.imgur.com/P6bqXtd.jpg?2)

License
=======
Copyright 2013, Edmodo, Inc. 

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License.
You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
