// java wrapper for vtkSimplePointsWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimplePointsWriter extends vtkDataSetWriter
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

  private native int GetDecimalPrecision_4();
  public int GetDecimalPrecision()
  {
    return GetDecimalPrecision_4();
  }

  private native void SetDecimalPrecision_5(int id0);
  public void SetDecimalPrecision(int id0)
  {
    SetDecimalPrecision_5(id0);
  }

  public vtkSimplePointsWriter() { super(); }

  public vtkSimplePointsWriter(long id) { super(id); }
  public native long   VTKInit();

}
