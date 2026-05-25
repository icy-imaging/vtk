// java wrapper for vtkVoxelContoursToSurfaceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVoxelContoursToSurfaceFilter extends vtkPolyDataAlgorithm
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

  private native void SetMemoryLimitInBytes_4(int id0);
  public void SetMemoryLimitInBytes(int id0)
  {
    SetMemoryLimitInBytes_4(id0);
  }

  private native int GetMemoryLimitInBytes_5();
  public int GetMemoryLimitInBytes()
  {
    return GetMemoryLimitInBytes_5();
  }

  private native void SetSpacing_6(double id0,double id1,double id2);
  public void SetSpacing(double id0,double id1,double id2)
  {
    SetSpacing_6(id0,id1,id2);
  }

  private native void SetSpacing_7(double id0[]);
  public void SetSpacing(double id0[])
  {
    SetSpacing_7(id0);
  }

  private native double[] GetSpacing_8();
  public double[] GetSpacing()
  {
    return GetSpacing_8();
  }

  public vtkVoxelContoursToSurfaceFilter() { super(); }

  public vtkVoxelContoursToSurfaceFilter(long id) { super(id); }
  public native long   VTKInit();

}
