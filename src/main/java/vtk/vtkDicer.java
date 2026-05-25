// java wrapper for vtkDicer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDicer extends vtkDataSetAlgorithm
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

  private native void SetFieldData_4(int id0);
  public void SetFieldData(int id0)
  {
    SetFieldData_4(id0);
  }

  private native int GetFieldData_5();
  public int GetFieldData()
  {
    return GetFieldData_5();
  }

  private native void FieldDataOn_6();
  public void FieldDataOn()
  {
    FieldDataOn_6();
  }

  private native void FieldDataOff_7();
  public void FieldDataOff()
  {
    FieldDataOff_7();
  }

  private native void SetDiceMode_8(int id0);
  public void SetDiceMode(int id0)
  {
    SetDiceMode_8(id0);
  }

  private native int GetDiceModeMinValue_9();
  public int GetDiceModeMinValue()
  {
    return GetDiceModeMinValue_9();
  }

  private native int GetDiceModeMaxValue_10();
  public int GetDiceModeMaxValue()
  {
    return GetDiceModeMaxValue_10();
  }

  private native int GetDiceMode_11();
  public int GetDiceMode()
  {
    return GetDiceMode_11();
  }

  private native void SetDiceModeToNumberOfPointsPerPiece_12();
  public void SetDiceModeToNumberOfPointsPerPiece()
  {
    SetDiceModeToNumberOfPointsPerPiece_12();
  }

  private native void SetDiceModeToSpecifiedNumberOfPieces_13();
  public void SetDiceModeToSpecifiedNumberOfPieces()
  {
    SetDiceModeToSpecifiedNumberOfPieces_13();
  }

  private native void SetDiceModeToMemoryLimitPerPiece_14();
  public void SetDiceModeToMemoryLimitPerPiece()
  {
    SetDiceModeToMemoryLimitPerPiece_14();
  }

  private native int GetNumberOfActualPieces_15();
  public int GetNumberOfActualPieces()
  {
    return GetNumberOfActualPieces_15();
  }

  private native void SetNumberOfPointsPerPiece_16(int id0);
  public void SetNumberOfPointsPerPiece(int id0)
  {
    SetNumberOfPointsPerPiece_16(id0);
  }

  private native int GetNumberOfPointsPerPieceMinValue_17();
  public int GetNumberOfPointsPerPieceMinValue()
  {
    return GetNumberOfPointsPerPieceMinValue_17();
  }

  private native int GetNumberOfPointsPerPieceMaxValue_18();
  public int GetNumberOfPointsPerPieceMaxValue()
  {
    return GetNumberOfPointsPerPieceMaxValue_18();
  }

  private native int GetNumberOfPointsPerPiece_19();
  public int GetNumberOfPointsPerPiece()
  {
    return GetNumberOfPointsPerPiece_19();
  }

  private native void SetNumberOfPieces_20(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_20(id0);
  }

  private native int GetNumberOfPiecesMinValue_21();
  public int GetNumberOfPiecesMinValue()
  {
    return GetNumberOfPiecesMinValue_21();
  }

  private native int GetNumberOfPiecesMaxValue_22();
  public int GetNumberOfPiecesMaxValue()
  {
    return GetNumberOfPiecesMaxValue_22();
  }

  private native int GetNumberOfPieces_23();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_23();
  }

  private native void SetMemoryLimit_24(long id0);
  public void SetMemoryLimit(long id0)
  {
    SetMemoryLimit_24(id0);
  }

  private native long GetMemoryLimitMinValue_25();
  public long GetMemoryLimitMinValue()
  {
    return GetMemoryLimitMinValue_25();
  }

  private native long GetMemoryLimitMaxValue_26();
  public long GetMemoryLimitMaxValue()
  {
    return GetMemoryLimitMaxValue_26();
  }

  private native long GetMemoryLimit_27();
  public long GetMemoryLimit()
  {
    return GetMemoryLimit_27();
  }

  public vtkDicer() { super(); }

  public vtkDicer(long id) { super(id); }

}
