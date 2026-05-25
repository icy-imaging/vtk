// java wrapper for vtkImageDataLIC2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageDataLIC2D extends vtkImageAlgorithm
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

  private native int SetContext_4(vtkRenderWindow id0);
  public int SetContext(vtkRenderWindow id0)
  {
    return SetContext_4(id0);
  }

  private native long GetContext_5();
  public vtkRenderWindow GetContext()
  {
    long temp = GetContext_5();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSteps_6(int id0);
  public void SetSteps(int id0)
  {
    SetSteps_6(id0);
  }

  private native int GetSteps_7();
  public int GetSteps()
  {
    return GetSteps_7();
  }

  private native void SetStepSize_8(double id0);
  public void SetStepSize(double id0)
  {
    SetStepSize_8(id0);
  }

  private native double GetStepSize_9();
  public double GetStepSize()
  {
    return GetStepSize_9();
  }

  private native void SetMagnification_10(int id0);
  public void SetMagnification(int id0)
  {
    SetMagnification_10(id0);
  }

  private native int GetMagnification_11();
  public int GetMagnification()
  {
    return GetMagnification_11();
  }

  private native int GetOpenGLExtensionsSupported_12();
  public int GetOpenGLExtensionsSupported()
  {
    return GetOpenGLExtensionsSupported_12();
  }

  public vtkImageDataLIC2D() { super(); }

  public vtkImageDataLIC2D(long id) { super(id); }
  public native long   VTKInit();

}
