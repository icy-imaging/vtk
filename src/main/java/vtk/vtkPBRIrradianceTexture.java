// java wrapper for vtkPBRIrradianceTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPBRIrradianceTexture extends vtkOpenGLTexture
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

  private native int GetIrradianceSize_8();
  public int GetIrradianceSize()
  {
    return GetIrradianceSize_8();
  }

  private native void SetIrradianceSize_9(int id0);
  public void SetIrradianceSize(int id0)
  {
    SetIrradianceSize_9(id0);
  }

  private native float GetIrradianceStep_10();
  public float GetIrradianceStep()
  {
    return GetIrradianceStep_10();
  }

  private native void SetIrradianceStep_11(float id0);
  public void SetIrradianceStep(float id0)
  {
    SetIrradianceStep_11(id0);
  }

  private native boolean GetConvertToLinear_12();
  public boolean GetConvertToLinear()
  {
    return GetConvertToLinear_12();
  }

  private native void SetConvertToLinear_13(boolean id0);
  public void SetConvertToLinear(boolean id0)
  {
    SetConvertToLinear_13(id0);
  }

  private native void ConvertToLinearOn_14();
  public void ConvertToLinearOn()
  {
    ConvertToLinearOn_14();
  }

  private native void ConvertToLinearOff_15();
  public void ConvertToLinearOff()
  {
    ConvertToLinearOff_15();
  }

  private native void ReleaseGraphicsResources_16(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_16(id0);
  }

  public vtkPBRIrradianceTexture() { super(); }

  public vtkPBRIrradianceTexture(long id) { super(id); }
  public native long   VTKInit();

}
