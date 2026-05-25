// java wrapper for vtkMultiPieceDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiPieceDataSet extends vtkPartitionedDataSet
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native void SetNumberOfPieces_5(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_5(id0);
  }

  private native int GetNumberOfPieces_6();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_6();
  }

  private native long GetPiece_7(int id0);
  public vtkDataSet GetPiece(int id0)
  {
    long temp = GetPiece_7(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPieceAsDataObject_8(int id0);
  public vtkDataObject GetPieceAsDataObject(int id0)
  {
    long temp = GetPieceAsDataObject_8(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPiece_9(int id0,vtkDataObject id1);
  public void SetPiece(int id0,vtkDataObject id1)
  {
    SetPiece_9(id0,id1);
  }

  private native long GetData_10(vtkInformation id0);
  public vtkMultiPieceDataSet GetData(vtkInformation id0)
  {
    long temp = GetData_10(id0);

    if (temp == 0) return null;
    return (vtkMultiPieceDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_11(vtkInformationVector id0,int id1);
  public vtkMultiPieceDataSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_11(id0,id1);

    if (temp == 0) return null;
    return (vtkMultiPieceDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkMultiPieceDataSet() { super(); }

  public vtkMultiPieceDataSet(long id) { super(id); }
  public native long   VTKInit();

}
