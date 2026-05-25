// java wrapper for vtkRayCastImageDisplayHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRayCastImageDisplayHelper extends vtkObject
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

  private native void RenderTexture_4(vtkVolume id0,vtkRenderer id1,vtkFixedPointRayCastImage id2,float id3);
  public void RenderTexture(vtkVolume id0,vtkRenderer id1,vtkFixedPointRayCastImage id2,float id3)
  {
    RenderTexture_4(id0,id1,id2,id3);
  }

  private native void SetPreMultipliedColors_5(int id0);
  public void SetPreMultipliedColors(int id0)
  {
    SetPreMultipliedColors_5(id0);
  }

  private native int GetPreMultipliedColorsMinValue_6();
  public int GetPreMultipliedColorsMinValue()
  {
    return GetPreMultipliedColorsMinValue_6();
  }

  private native int GetPreMultipliedColorsMaxValue_7();
  public int GetPreMultipliedColorsMaxValue()
  {
    return GetPreMultipliedColorsMaxValue_7();
  }

  private native int GetPreMultipliedColors_8();
  public int GetPreMultipliedColors()
  {
    return GetPreMultipliedColors_8();
  }

  private native void PreMultipliedColorsOn_9();
  public void PreMultipliedColorsOn()
  {
    PreMultipliedColorsOn_9();
  }

  private native void PreMultipliedColorsOff_10();
  public void PreMultipliedColorsOff()
  {
    PreMultipliedColorsOff_10();
  }

  private native void SetPixelScale_11(float id0);
  public void SetPixelScale(float id0)
  {
    SetPixelScale_11(id0);
  }

  private native float GetPixelScale_12();
  public float GetPixelScale()
  {
    return GetPixelScale_12();
  }

  private native void ReleaseGraphicsResources_13(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_13(id0);
  }

  public vtkRayCastImageDisplayHelper() { super(); }

  public vtkRayCastImageDisplayHelper(long id) { super(id); }
  public native long   VTKInit();

}
