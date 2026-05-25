// java wrapper for vtkImplicitImageRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitImageRepresentation extends vtkImplicitPlaneRepresentation
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void PlaceImage_4(vtkImageData id0);
  public void PlaceImage(vtkImageData id0)
  {
    PlaceImage_4(id0);
  }

  private native void PlaceImage_5(vtkAlgorithmOutput id0);
  public void PlaceImage(vtkAlgorithmOutput id0)
  {
    PlaceImage_5(id0);
  }

  private native void BuildRepresentation_6();
  public void BuildRepresentation()
  {
    BuildRepresentation_6();
  }

  private native void SetUserControlledLookupTable_7(boolean id0);
  public void SetUserControlledLookupTable(boolean id0)
  {
    SetUserControlledLookupTable_7(id0);
  }

  private native boolean GetUserControlledLookupTable_8();
  public boolean GetUserControlledLookupTable()
  {
    return GetUserControlledLookupTable_8();
  }

  private native void UserControlledLookupTableOn_9();
  public void UserControlledLookupTableOn()
  {
    UserControlledLookupTableOn_9();
  }

  private native void UserControlledLookupTableOff_10();
  public void UserControlledLookupTableOff()
  {
    UserControlledLookupTableOff_10();
  }

  private native void SetLookupTable_11(vtkLookupTable id0);
  public void SetLookupTable(vtkLookupTable id0)
  {
    SetLookupTable_11(id0);
  }

  private native long GetLookupTable_12();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_12();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextureInterpolate_13(boolean id0);
  public void SetTextureInterpolate(boolean id0)
  {
    SetTextureInterpolate_13(id0);
  }

  private native boolean GetTextureInterpolate_14();
  public boolean GetTextureInterpolate()
  {
    return GetTextureInterpolate_14();
  }

  private native void TextureInterpolateOn_15();
  public void TextureInterpolateOn()
  {
    TextureInterpolateOn_15();
  }

  private native void TextureInterpolateOff_16();
  public void TextureInterpolateOff()
  {
    TextureInterpolateOff_16();
  }

  private native void SetResliceInterpolate_17(int id0);
  public void SetResliceInterpolate(int id0)
  {
    SetResliceInterpolate_17(id0);
  }

  private native int GetResliceInterpolate_18();
  public int GetResliceInterpolate()
  {
    return GetResliceInterpolate_18();
  }

  private native void SetResliceInterpolateToNearestNeighbour_19();
  public void SetResliceInterpolateToNearestNeighbour()
  {
    SetResliceInterpolateToNearestNeighbour_19();
  }

  private native void SetResliceInterpolateToLinear_20();
  public void SetResliceInterpolateToLinear()
  {
    SetResliceInterpolateToLinear_20();
  }

  private native void SetResliceInterpolateToCubic_21();
  public void SetResliceInterpolateToCubic()
  {
    SetResliceInterpolateToCubic_21();
  }

  private native void SetColorMap_22(vtkImageMapToColors id0);
  public void SetColorMap(vtkImageMapToColors id0)
  {
    SetColorMap_22(id0);
  }

  private native long GetColorMap_23();
  public vtkImageMapToColors GetColorMap()
  {
    long temp = GetColorMap_23();

    if (temp == 0) return null;
    return (vtkImageMapToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetReslice_24();
  public vtkImageReslice GetReslice()
  {
    long temp = GetReslice_24();

    if (temp == 0) return null;
    return (vtkImageReslice)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCropPlaneToBoundingBox_25(boolean id0);
  public void SetCropPlaneToBoundingBox(boolean id0)
  {
    SetCropPlaneToBoundingBox_25(id0);
  }

  public vtkImplicitImageRepresentation() { super(); }

  public vtkImplicitImageRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
