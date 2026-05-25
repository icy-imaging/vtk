// java wrapper for vtkSPHQuinticKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSPHQuinticKernel extends vtkSPHKernel
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

  private native void Initialize_4(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2);
  public void Initialize(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2)
  {
    Initialize_4(id0,id1,id2);
  }

  private native double ComputeFunctionWeight_5(double id0);
  public double ComputeFunctionWeight(double id0)
  {
    return ComputeFunctionWeight_5(id0);
  }

  private native double ComputeDerivWeight_6(double id0);
  public double ComputeDerivWeight(double id0)
  {
    return ComputeDerivWeight_6(id0);
  }

  public vtkSPHQuinticKernel() { super(); }

  public vtkSPHQuinticKernel(long id) { super(id); }
  public native long   VTKInit();

}
