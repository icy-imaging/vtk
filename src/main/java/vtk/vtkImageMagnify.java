// java wrapper for vtkImageMagnify object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMagnify extends vtkThreadedImageAlgorithm
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

  private native void SetMagnificationFactors_4(int id0,int id1,int id2);
  public void SetMagnificationFactors(int id0,int id1,int id2)
  {
    SetMagnificationFactors_4(id0,id1,id2);
  }

  private native void SetMagnificationFactors_5(int id0[]);
  public void SetMagnificationFactors(int id0[])
  {
    SetMagnificationFactors_5(id0);
  }

  private native int[] GetMagnificationFactors_6();
  public int[] GetMagnificationFactors()
  {
    return GetMagnificationFactors_6();
  }

  private native void SetInterpolate_7(int id0);
  public void SetInterpolate(int id0)
  {
    SetInterpolate_7(id0);
  }

  private native int GetInterpolate_8();
  public int GetInterpolate()
  {
    return GetInterpolate_8();
  }

  private native void InterpolateOn_9();
  public void InterpolateOn()
  {
    InterpolateOn_9();
  }

  private native void InterpolateOff_10();
  public void InterpolateOff()
  {
    InterpolateOff_10();
  }

  public vtkImageMagnify() { super(); }

  public vtkImageMagnify(long id) { super(id); }
  public native long   VTKInit();

}
