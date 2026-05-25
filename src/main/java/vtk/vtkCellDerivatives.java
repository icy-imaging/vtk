// java wrapper for vtkCellDerivatives object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellDerivatives extends vtkDataSetAlgorithm
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

  private native void SetVectorMode_4(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_4(id0);
  }

  private native int GetVectorMode_5();
  public int GetVectorMode()
  {
    return GetVectorMode_5();
  }

  private native void SetVectorModeToPassVectors_6();
  public void SetVectorModeToPassVectors()
  {
    SetVectorModeToPassVectors_6();
  }

  private native void SetVectorModeToComputeGradient_7();
  public void SetVectorModeToComputeGradient()
  {
    SetVectorModeToComputeGradient_7();
  }

  private native void SetVectorModeToComputeVorticity_8();
  public void SetVectorModeToComputeVorticity()
  {
    SetVectorModeToComputeVorticity_8();
  }

  private native byte[] GetVectorModeAsString_9();
  public String GetVectorModeAsString()
  {
    return new String(GetVectorModeAsString_9(), StandardCharsets.UTF_8);
  }

  private native void SetTensorMode_10(int id0);
  public void SetTensorMode(int id0)
  {
    SetTensorMode_10(id0);
  }

  private native int GetTensorMode_11();
  public int GetTensorMode()
  {
    return GetTensorMode_11();
  }

  private native void SetTensorModeToPassTensors_12();
  public void SetTensorModeToPassTensors()
  {
    SetTensorModeToPassTensors_12();
  }

  private native void SetTensorModeToComputeGradient_13();
  public void SetTensorModeToComputeGradient()
  {
    SetTensorModeToComputeGradient_13();
  }

  private native void SetTensorModeToComputeStrain_14();
  public void SetTensorModeToComputeStrain()
  {
    SetTensorModeToComputeStrain_14();
  }

  private native void SetTensorModeToComputeGreenLagrangeStrain_15();
  public void SetTensorModeToComputeGreenLagrangeStrain()
  {
    SetTensorModeToComputeGreenLagrangeStrain_15();
  }

  private native byte[] GetTensorModeAsString_16();
  public String GetTensorModeAsString()
  {
    return new String(GetTensorModeAsString_16(), StandardCharsets.UTF_8);
  }

  public vtkCellDerivatives() { super(); }

  public vtkCellDerivatives(long id) { super(id); }
  public native long   VTKInit();

}
