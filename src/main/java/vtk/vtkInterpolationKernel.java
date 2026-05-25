// java wrapper for vtkInterpolationKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInterpolationKernel extends vtkObject
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

  private native void SetRequiresInitialization_5(boolean id0);
  public void SetRequiresInitialization(boolean id0)
  {
    SetRequiresInitialization_5(id0);
  }

  private native boolean GetRequiresInitialization_6();
  public boolean GetRequiresInitialization()
  {
    return GetRequiresInitialization_6();
  }

  private native void RequiresInitializationOn_7();
  public void RequiresInitializationOn()
  {
    RequiresInitializationOn_7();
  }

  private native void RequiresInitializationOff_8();
  public void RequiresInitializationOff()
  {
    RequiresInitializationOff_8();
  }

  private native long ComputeBasis_9(double id0[],vtkIdList id1,long id2);
  public long ComputeBasis(double id0[],vtkIdList id1,long id2)
  {
    return ComputeBasis_9(id0,id1,id2);
  }

  private native long ComputeWeights_10(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_10(id0,id1,id2);
  }

  public vtkInterpolationKernel() { super(); }

  public vtkInterpolationKernel(long id) { super(id); }

}
