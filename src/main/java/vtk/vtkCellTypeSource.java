// java wrapper for vtkCellTypeSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellTypeSource extends vtkUnstructuredGridAlgorithm
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

  private native void SetCellType_4(int id0);
  public void SetCellType(int id0)
  {
    SetCellType_4(id0);
  }

  private native int GetCellType_5();
  public int GetCellType()
  {
    return GetCellType_5();
  }

  private native void SetCellOrder_6(int id0);
  public void SetCellOrder(int id0)
  {
    SetCellOrder_6(id0);
  }

  private native int GetCellOrder_7();
  public int GetCellOrder()
  {
    return GetCellOrder_7();
  }

  private native void SetCompleteQuadraticSimplicialElements_8(boolean id0);
  public void SetCompleteQuadraticSimplicialElements(boolean id0)
  {
    SetCompleteQuadraticSimplicialElements_8(id0);
  }

  private native boolean GetCompleteQuadraticSimplicialElements_9();
  public boolean GetCompleteQuadraticSimplicialElements()
  {
    return GetCompleteQuadraticSimplicialElements_9();
  }

  private native void CompleteQuadraticSimplicialElementsOn_10();
  public void CompleteQuadraticSimplicialElementsOn()
  {
    CompleteQuadraticSimplicialElementsOn_10();
  }

  private native void CompleteQuadraticSimplicialElementsOff_11();
  public void CompleteQuadraticSimplicialElementsOff()
  {
    CompleteQuadraticSimplicialElementsOff_11();
  }

  private native void SetPolynomialFieldOrder_12(int id0);
  public void SetPolynomialFieldOrder(int id0)
  {
    SetPolynomialFieldOrder_12(id0);
  }

  private native int GetPolynomialFieldOrderMinValue_13();
  public int GetPolynomialFieldOrderMinValue()
  {
    return GetPolynomialFieldOrderMinValue_13();
  }

  private native int GetPolynomialFieldOrderMaxValue_14();
  public int GetPolynomialFieldOrderMaxValue()
  {
    return GetPolynomialFieldOrderMaxValue_14();
  }

  private native int GetPolynomialFieldOrder_15();
  public int GetPolynomialFieldOrder()
  {
    return GetPolynomialFieldOrder_15();
  }

  private native int GetCellDimension_16();
  public int GetCellDimension()
  {
    return GetCellDimension_16();
  }

  private native void SetOutputPrecision_17(int id0);
  public void SetOutputPrecision(int id0)
  {
    SetOutputPrecision_17(id0);
  }

  private native int GetOutputPrecisionMinValue_18();
  public int GetOutputPrecisionMinValue()
  {
    return GetOutputPrecisionMinValue_18();
  }

  private native int GetOutputPrecisionMaxValue_19();
  public int GetOutputPrecisionMaxValue()
  {
    return GetOutputPrecisionMaxValue_19();
  }

  private native int GetOutputPrecision_20();
  public int GetOutputPrecision()
  {
    return GetOutputPrecision_20();
  }

  private native void SetBlocksDimensions_21(int id0,int id1,int id2);
  public void SetBlocksDimensions(int id0,int id1,int id2)
  {
    SetBlocksDimensions_21(id0,id1,id2);
  }

  private native int[] GetBlocksDimensions_22();
  public int[] GetBlocksDimensions()
  {
    return GetBlocksDimensions_22();
  }

  public vtkCellTypeSource() { super(); }

  public vtkCellTypeSource(long id) { super(id); }
  public native long   VTKInit();

}
