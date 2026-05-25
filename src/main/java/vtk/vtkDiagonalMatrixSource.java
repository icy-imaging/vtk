// java wrapper for vtkDiagonalMatrixSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDiagonalMatrixSource extends vtkArrayDataAlgorithm
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

  private native int GetArrayType_4();
  public int GetArrayType()
  {
    return GetArrayType_4();
  }

  private native void SetArrayType_5(int id0);
  public void SetArrayType(int id0)
  {
    SetArrayType_5(id0);
  }

  private native long GetExtents_6();
  public long GetExtents()
  {
    return GetExtents_6();
  }

  private native void SetExtents_7(long id0);
  public void SetExtents(long id0)
  {
    SetExtents_7(id0);
  }

  private native double GetDiagonal_8();
  public double GetDiagonal()
  {
    return GetDiagonal_8();
  }

  private native void SetDiagonal_9(double id0);
  public void SetDiagonal(double id0)
  {
    SetDiagonal_9(id0);
  }

  private native double GetSuperDiagonal_10();
  public double GetSuperDiagonal()
  {
    return GetSuperDiagonal_10();
  }

  private native void SetSuperDiagonal_11(double id0);
  public void SetSuperDiagonal(double id0)
  {
    SetSuperDiagonal_11(id0);
  }

  private native double GetSubDiagonal_12();
  public double GetSubDiagonal()
  {
    return GetSubDiagonal_12();
  }

  private native void SetSubDiagonal_13(double id0);
  public void SetSubDiagonal(double id0)
  {
    SetSubDiagonal_13(id0);
  }

  private native byte[] GetRowLabel_14();
  public String GetRowLabel()
  {
    return new String(GetRowLabel_14(), StandardCharsets.UTF_8);
  }

  private native void SetRowLabel_15(byte[] id0, int len0);
  public void SetRowLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRowLabel_15(bytes0, bytes0.length);
  }

  private native byte[] GetColumnLabel_16();
  public String GetColumnLabel()
  {
    return new String(GetColumnLabel_16(), StandardCharsets.UTF_8);
  }

  private native void SetColumnLabel_17(byte[] id0, int len0);
  public void SetColumnLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnLabel_17(bytes0, bytes0.length);
  }

  public vtkDiagonalMatrixSource() { super(); }

  public vtkDiagonalMatrixSource(long id) { super(id); }
  public native long   VTKInit();

}
