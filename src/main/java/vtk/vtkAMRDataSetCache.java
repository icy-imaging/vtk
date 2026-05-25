// java wrapper for vtkAMRDataSetCache object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRDataSetCache extends vtkObject
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

  private native void InsertAMRBlock_4(int id0,vtkUniformGrid id1);
  public void InsertAMRBlock(int id0,vtkUniformGrid id1)
  {
    InsertAMRBlock_4(id0,id1);
  }

  private native void InsertAMRBlockPointData_5(int id0,vtkDataArray id1);
  public void InsertAMRBlockPointData(int id0,vtkDataArray id1)
  {
    InsertAMRBlockPointData_5(id0,id1);
  }

  private native void InsertAMRBlockCellData_6(int id0,vtkDataArray id1);
  public void InsertAMRBlockCellData(int id0,vtkDataArray id1)
  {
    InsertAMRBlockCellData_6(id0,id1);
  }

  private native long GetAMRBlockCellData_7(int id0,byte[] id1, int len1);
  public vtkDataArray GetAMRBlockCellData(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = GetAMRBlockCellData_7(id0,bytes1, bytes1.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAMRBlockPointData_8(int id0,byte[] id1, int len1);
  public vtkDataArray GetAMRBlockPointData(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = GetAMRBlockPointData_8(id0,bytes1, bytes1.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAMRBlock_9(int id0);
  public vtkUniformGrid GetAMRBlock(int id0)
  {
    long temp = GetAMRBlock_9(id0);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasAMRBlockCellData_10(int id0,byte[] id1, int len1);
  public boolean HasAMRBlockCellData(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return HasAMRBlockCellData_10(id0,bytes1, bytes1.length);
  }

  private native boolean HasAMRBlockPointData_11(int id0,byte[] id1, int len1);
  public boolean HasAMRBlockPointData(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return HasAMRBlockPointData_11(id0,bytes1, bytes1.length);
  }

  private native boolean HasAMRBlock_12(int id0);
  public boolean HasAMRBlock(int id0)
  {
    return HasAMRBlock_12(id0);
  }

  public vtkAMRDataSetCache() { super(); }

  public vtkAMRDataSetCache(long id) { super(id); }
  public native long   VTKInit();

}
