// java wrapper for vtkPieceRequestFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPieceRequestFilter extends vtkAlgorithm
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

  private native void SetNumberOfPieces_4(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_4(id0);
  }

  private native int GetNumberOfPiecesMinValue_5();
  public int GetNumberOfPiecesMinValue()
  {
    return GetNumberOfPiecesMinValue_5();
  }

  private native int GetNumberOfPiecesMaxValue_6();
  public int GetNumberOfPiecesMaxValue()
  {
    return GetNumberOfPiecesMaxValue_6();
  }

  private native int GetNumberOfPieces_7();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_7();
  }

  private native void SetPiece_8(int id0);
  public void SetPiece(int id0)
  {
    SetPiece_8(id0);
  }

  private native int GetPieceMinValue_9();
  public int GetPieceMinValue()
  {
    return GetPieceMinValue_9();
  }

  private native int GetPieceMaxValue_10();
  public int GetPieceMaxValue()
  {
    return GetPieceMaxValue_10();
  }

  private native int GetPiece_11();
  public int GetPiece()
  {
    return GetPiece_11();
  }

  private native long GetOutput_12();
  public vtkDataObject GetOutput()
  {
    long temp = GetOutput_12();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_13(int id0);
  public vtkDataObject GetOutput(int id0)
  {
    long temp = GetOutput_13(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInputData_14(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_14(id0);
  }

  private native void SetInputData_15(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_15(id0,id1);
  }

  public vtkPieceRequestFilter() { super(); }

  public vtkPieceRequestFilter(long id) { super(id); }
  public native long   VTKInit();

}
