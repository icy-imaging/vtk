// java wrapper for vtkImageSeparableConvolution object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSeparableConvolution extends vtkImageDecomposeFilter
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

  private native void SetXKernel_4(vtkFloatArray id0);
  public void SetXKernel(vtkFloatArray id0)
  {
    SetXKernel_4(id0);
  }

  private native long GetXKernel_5();
  public vtkFloatArray GetXKernel()
  {
    long temp = GetXKernel_5();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYKernel_6(vtkFloatArray id0);
  public void SetYKernel(vtkFloatArray id0)
  {
    SetYKernel_6(id0);
  }

  private native long GetYKernel_7();
  public vtkFloatArray GetYKernel()
  {
    long temp = GetYKernel_7();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZKernel_8(vtkFloatArray id0);
  public void SetZKernel(vtkFloatArray id0)
  {
    SetZKernel_8(id0);
  }

  private native long GetZKernel_9();
  public vtkFloatArray GetZKernel()
  {
    long temp = GetZKernel_9();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  public vtkImageSeparableConvolution() { super(); }

  public vtkImageSeparableConvolution(long id) { super(id); }
  public native long   VTKInit();

}
