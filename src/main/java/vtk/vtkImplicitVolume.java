// java wrapper for vtkImplicitVolume object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitVolume extends vtkImplicitFunction
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native double EvaluateFunction_5(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_5(id0);
  }

  private native void EvaluateGradient_6(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_6(id0,id1);
  }

  private native void SetVolume_7(vtkImageData id0);
  public void SetVolume(vtkImageData id0)
  {
    SetVolume_7(id0);
  }

  private native long GetVolume_8();
  public vtkImageData GetVolume()
  {
    long temp = GetVolume_8();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutValue_9(double id0);
  public void SetOutValue(double id0)
  {
    SetOutValue_9(id0);
  }

  private native double GetOutValue_10();
  public double GetOutValue()
  {
    return GetOutValue_10();
  }

  private native void SetOutGradient_11(double id0,double id1,double id2);
  public void SetOutGradient(double id0,double id1,double id2)
  {
    SetOutGradient_11(id0,id1,id2);
  }

  private native void SetOutGradient_12(double id0[]);
  public void SetOutGradient(double id0[])
  {
    SetOutGradient_12(id0);
  }

  private native double[] GetOutGradient_13();
  public double[] GetOutGradient()
  {
    return GetOutGradient_13();
  }

  private native void EvaluateFunction_14(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_14(id0,id1);
  }

  private native double EvaluateFunction_15(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_15(id0,id1,id2);
  }

  public vtkImplicitVolume() { super(); }

  public vtkImplicitVolume(long id) { super(id); }
  public native long   VTKInit();

}
