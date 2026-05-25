// java wrapper for vtkDotProductSimilarity object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDotProductSimilarity extends vtkTableAlgorithm
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

  private native long GetVectorDimension_4();
  public long GetVectorDimension()
  {
    return GetVectorDimension_4();
  }

  private native void SetVectorDimension_5(long id0);
  public void SetVectorDimension(long id0)
  {
    SetVectorDimension_5(id0);
  }

  private native int GetUpperDiagonal_6();
  public int GetUpperDiagonal()
  {
    return GetUpperDiagonal_6();
  }

  private native void SetUpperDiagonal_7(int id0);
  public void SetUpperDiagonal(int id0)
  {
    SetUpperDiagonal_7(id0);
  }

  private native int GetDiagonal_8();
  public int GetDiagonal()
  {
    return GetDiagonal_8();
  }

  private native void SetDiagonal_9(int id0);
  public void SetDiagonal(int id0)
  {
    SetDiagonal_9(id0);
  }

  private native int GetLowerDiagonal_10();
  public int GetLowerDiagonal()
  {
    return GetLowerDiagonal_10();
  }

  private native void SetLowerDiagonal_11(int id0);
  public void SetLowerDiagonal(int id0)
  {
    SetLowerDiagonal_11(id0);
  }

  private native int GetFirstSecond_12();
  public int GetFirstSecond()
  {
    return GetFirstSecond_12();
  }

  private native void SetFirstSecond_13(int id0);
  public void SetFirstSecond(int id0)
  {
    SetFirstSecond_13(id0);
  }

  private native int GetSecondFirst_14();
  public int GetSecondFirst()
  {
    return GetSecondFirst_14();
  }

  private native void SetSecondFirst_15(int id0);
  public void SetSecondFirst(int id0)
  {
    SetSecondFirst_15(id0);
  }

  private native double GetMinimumThreshold_16();
  public double GetMinimumThreshold()
  {
    return GetMinimumThreshold_16();
  }

  private native void SetMinimumThreshold_17(double id0);
  public void SetMinimumThreshold(double id0)
  {
    SetMinimumThreshold_17(id0);
  }

  private native long GetMinimumCount_18();
  public long GetMinimumCount()
  {
    return GetMinimumCount_18();
  }

  private native void SetMinimumCount_19(long id0);
  public void SetMinimumCount(long id0)
  {
    SetMinimumCount_19(id0);
  }

  private native long GetMaximumCount_20();
  public long GetMaximumCount()
  {
    return GetMaximumCount_20();
  }

  private native void SetMaximumCount_21(long id0);
  public void SetMaximumCount(long id0)
  {
    SetMaximumCount_21(id0);
  }

  public vtkDotProductSimilarity() { super(); }

  public vtkDotProductSimilarity(long id) { super(id); }
  public native long   VTKInit();

}
