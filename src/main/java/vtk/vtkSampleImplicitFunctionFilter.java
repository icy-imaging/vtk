// java wrapper for vtkSampleImplicitFunctionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSampleImplicitFunctionFilter extends vtkDataSetAlgorithm
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

  private native void SetImplicitFunction_4(vtkImplicitFunction id0);
  public void SetImplicitFunction(vtkImplicitFunction id0)
  {
    SetImplicitFunction_4(id0);
  }

  private native long GetImplicitFunction_5();
  public vtkImplicitFunction GetImplicitFunction()
  {
    long temp = GetImplicitFunction_5();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeGradients_6(int id0);
  public void SetComputeGradients(int id0)
  {
    SetComputeGradients_6(id0);
  }

  private native int GetComputeGradients_7();
  public int GetComputeGradients()
  {
    return GetComputeGradients_7();
  }

  private native void ComputeGradientsOn_8();
  public void ComputeGradientsOn()
  {
    ComputeGradientsOn_8();
  }

  private native void ComputeGradientsOff_9();
  public void ComputeGradientsOff()
  {
    ComputeGradientsOff_9();
  }

  private native void SetScalarArrayName_10(byte[] id0, int len0);
  public void SetScalarArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetScalarArrayName_11();
  public String GetScalarArrayName()
  {
    return new String(GetScalarArrayName_11(), StandardCharsets.UTF_8);
  }

  private native void SetGradientArrayName_12(byte[] id0, int len0);
  public void SetGradientArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGradientArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetGradientArrayName_13();
  public String GetGradientArrayName()
  {
    return new String(GetGradientArrayName_13(), StandardCharsets.UTF_8);
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  public vtkSampleImplicitFunctionFilter() { super(); }

  public vtkSampleImplicitFunctionFilter(long id) { super(id); }
  public native long   VTKInit();

}
