// java wrapper for vtkShepardKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShepardKernel extends vtkGeneralizedKernel
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

  private native long ComputeWeights_4(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3)
  {
    return ComputeWeights_4(id0,id1,id2,id3);
  }

  private native void SetPowerParameter_5(double id0);
  public void SetPowerParameter(double id0)
  {
    SetPowerParameter_5(id0);
  }

  private native double GetPowerParameterMinValue_6();
  public double GetPowerParameterMinValue()
  {
    return GetPowerParameterMinValue_6();
  }

  private native double GetPowerParameterMaxValue_7();
  public double GetPowerParameterMaxValue()
  {
    return GetPowerParameterMaxValue_7();
  }

  private native double GetPowerParameter_8();
  public double GetPowerParameter()
  {
    return GetPowerParameter_8();
  }

  private native long ComputeWeights_9(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_9(id0,id1,id2);
  }

  public vtkShepardKernel() { super(); }

  public vtkShepardKernel(long id) { super(id); }
  public native long   VTKInit();

}
