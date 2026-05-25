// java wrapper for vtkExtractCellsByType object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractCellsByType extends vtkDataSetAlgorithm
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

  private native void AddCellType_4(int id0);
  public void AddCellType(int id0)
  {
    AddCellType_4(id0);
  }

  private native void AddAllCellTypes_5();
  public void AddAllCellTypes()
  {
    AddAllCellTypes_5();
  }

  private native void RemoveCellType_6(int id0);
  public void RemoveCellType(int id0)
  {
    RemoveCellType_6(id0);
  }

  private native void RemoveAllCellTypes_7();
  public void RemoveAllCellTypes()
  {
    RemoveAllCellTypes_7();
  }

  private native boolean ExtractCellType_8(int id0);
  public boolean ExtractCellType(int id0)
  {
    return ExtractCellType_8(id0);
  }

  public vtkExtractCellsByType() { super(); }

  public vtkExtractCellsByType(long id) { super(id); }
  public native long   VTKInit();

}
