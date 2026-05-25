// java wrapper for vtkLinearKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinearKernel extends vtkGeneralizedKernel
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

  private native long ComputeWeights_5(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_5(id0,id1,id2);
  }

  public vtkLinearKernel() { super(); }

  public vtkLinearKernel(long id) { super(id); }
  public native long   VTKInit();

}
