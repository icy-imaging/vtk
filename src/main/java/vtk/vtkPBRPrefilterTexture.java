// java wrapper for vtkPBRPrefilterTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPBRPrefilterTexture extends vtkOpenGLTexture
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

  private native void SetInputTexture_4(vtkOpenGLTexture id0);
  public void SetInputTexture(vtkOpenGLTexture id0)
  {
    SetInputTexture_4(id0);
  }

  private native long GetInputTexture_5();
  public vtkOpenGLTexture GetInputTexture()
  {
    long temp = GetInputTexture_5();

    if (temp == 0) return null;
    return (vtkOpenGLTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Load_6(vtkRenderer id0);
  public void Load(vtkRenderer id0)
  {
    Load_6(id0);
  }

  private native void Render_7(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_7(id0);
  }

  private native int GetPrefilterSize_8();
  public int GetPrefilterSize()
  {
    return GetPrefilterSize_8();
  }

  private native int GetPrefilterLevels_9();
  public int GetPrefilterLevels()
  {
    return GetPrefilterLevels_9();
  }

  private native void SetPrefilterLevels_10(int id0);
  public void SetPrefilterLevels(int id0)
  {
    SetPrefilterLevels_10(id0);
  }

  private native int GetPrefilterMaxSamples_11();
  public int GetPrefilterMaxSamples()
  {
    return GetPrefilterMaxSamples_11();
  }

  private native void SetPrefilterMaxSamples_12(int id0);
  public void SetPrefilterMaxSamples(int id0)
  {
    SetPrefilterMaxSamples_12(id0);
  }

  private native boolean GetConvertToLinear_13();
  public boolean GetConvertToLinear()
  {
    return GetConvertToLinear_13();
  }

  private native void SetConvertToLinear_14(boolean id0);
  public void SetConvertToLinear(boolean id0)
  {
    SetConvertToLinear_14(id0);
  }

  private native void ConvertToLinearOn_15();
  public void ConvertToLinearOn()
  {
    ConvertToLinearOn_15();
  }

  private native void ConvertToLinearOff_16();
  public void ConvertToLinearOff()
  {
    ConvertToLinearOff_16();
  }

  private native boolean GetHalfPrecision_17();
  public boolean GetHalfPrecision()
  {
    return GetHalfPrecision_17();
  }

  private native void SetHalfPrecision_18(boolean id0);
  public void SetHalfPrecision(boolean id0)
  {
    SetHalfPrecision_18(id0);
  }

  private native void HalfPrecisionOn_19();
  public void HalfPrecisionOn()
  {
    HalfPrecisionOn_19();
  }

  private native void HalfPrecisionOff_20();
  public void HalfPrecisionOff()
  {
    HalfPrecisionOff_20();
  }

  private native void ReleaseGraphicsResources_21(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_21(id0);
  }

  public vtkPBRPrefilterTexture() { super(); }

  public vtkPBRPrefilterTexture(long id) { super(id); }
  public native long   VTKInit();

}
