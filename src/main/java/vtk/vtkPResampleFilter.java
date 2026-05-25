// java wrapper for vtkPResampleFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPResampleFilter extends vtkImageAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseInputBounds_6(int id0);
  public void SetUseInputBounds(int id0)
  {
    SetUseInputBounds_6(id0);
  }

  private native int GetUseInputBounds_7();
  public int GetUseInputBounds()
  {
    return GetUseInputBounds_7();
  }

  private native void UseInputBoundsOn_8();
  public void UseInputBoundsOn()
  {
    UseInputBoundsOn_8();
  }

  private native void UseInputBoundsOff_9();
  public void UseInputBoundsOff()
  {
    UseInputBoundsOff_9();
  }

  private native void SetCustomSamplingBounds_10(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetCustomSamplingBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetCustomSamplingBounds_10(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCustomSamplingBounds_11(double id0[]);
  public void SetCustomSamplingBounds(double id0[])
  {
    SetCustomSamplingBounds_11(id0);
  }

  private native double[] GetCustomSamplingBounds_12();
  public double[] GetCustomSamplingBounds()
  {
    return GetCustomSamplingBounds_12();
  }

  private native void SetSamplingDimension_13(int id0,int id1,int id2);
  public void SetSamplingDimension(int id0,int id1,int id2)
  {
    SetSamplingDimension_13(id0,id1,id2);
  }

  private native void SetSamplingDimension_14(int id0[]);
  public void SetSamplingDimension(int id0[])
  {
    SetSamplingDimension_14(id0);
  }

  private native int[] GetSamplingDimension_15();
  public int[] GetSamplingDimension()
  {
    return GetSamplingDimension_15();
  }

  public vtkPResampleFilter() { super(); }

  public vtkPResampleFilter(long id) { super(id); }
  public native long   VTKInit();

}
