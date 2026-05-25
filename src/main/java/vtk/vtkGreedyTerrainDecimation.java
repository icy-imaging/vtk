// java wrapper for vtkGreedyTerrainDecimation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGreedyTerrainDecimation extends vtkPolyDataAlgorithm
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

  private native void SetErrorMeasure_4(int id0);
  public void SetErrorMeasure(int id0)
  {
    SetErrorMeasure_4(id0);
  }

  private native int GetErrorMeasureMinValue_5();
  public int GetErrorMeasureMinValue()
  {
    return GetErrorMeasureMinValue_5();
  }

  private native int GetErrorMeasureMaxValue_6();
  public int GetErrorMeasureMaxValue()
  {
    return GetErrorMeasureMaxValue_6();
  }

  private native int GetErrorMeasure_7();
  public int GetErrorMeasure()
  {
    return GetErrorMeasure_7();
  }

  private native void SetErrorMeasureToNumberOfTriangles_8();
  public void SetErrorMeasureToNumberOfTriangles()
  {
    SetErrorMeasureToNumberOfTriangles_8();
  }

  private native void SetErrorMeasureToSpecifiedReduction_9();
  public void SetErrorMeasureToSpecifiedReduction()
  {
    SetErrorMeasureToSpecifiedReduction_9();
  }

  private native void SetErrorMeasureToAbsoluteError_10();
  public void SetErrorMeasureToAbsoluteError()
  {
    SetErrorMeasureToAbsoluteError_10();
  }

  private native void SetErrorMeasureToRelativeError_11();
  public void SetErrorMeasureToRelativeError()
  {
    SetErrorMeasureToRelativeError_11();
  }

  private native void SetNumberOfTriangles_12(long id0);
  public void SetNumberOfTriangles(long id0)
  {
    SetNumberOfTriangles_12(id0);
  }

  private native long GetNumberOfTrianglesMinValue_13();
  public long GetNumberOfTrianglesMinValue()
  {
    return GetNumberOfTrianglesMinValue_13();
  }

  private native long GetNumberOfTrianglesMaxValue_14();
  public long GetNumberOfTrianglesMaxValue()
  {
    return GetNumberOfTrianglesMaxValue_14();
  }

  private native long GetNumberOfTriangles_15();
  public long GetNumberOfTriangles()
  {
    return GetNumberOfTriangles_15();
  }

  private native void SetReduction_16(double id0);
  public void SetReduction(double id0)
  {
    SetReduction_16(id0);
  }

  private native double GetReductionMinValue_17();
  public double GetReductionMinValue()
  {
    return GetReductionMinValue_17();
  }

  private native double GetReductionMaxValue_18();
  public double GetReductionMaxValue()
  {
    return GetReductionMaxValue_18();
  }

  private native double GetReduction_19();
  public double GetReduction()
  {
    return GetReduction_19();
  }

  private native void SetAbsoluteError_20(double id0);
  public void SetAbsoluteError(double id0)
  {
    SetAbsoluteError_20(id0);
  }

  private native double GetAbsoluteErrorMinValue_21();
  public double GetAbsoluteErrorMinValue()
  {
    return GetAbsoluteErrorMinValue_21();
  }

  private native double GetAbsoluteErrorMaxValue_22();
  public double GetAbsoluteErrorMaxValue()
  {
    return GetAbsoluteErrorMaxValue_22();
  }

  private native double GetAbsoluteError_23();
  public double GetAbsoluteError()
  {
    return GetAbsoluteError_23();
  }

  private native void SetRelativeError_24(double id0);
  public void SetRelativeError(double id0)
  {
    SetRelativeError_24(id0);
  }

  private native double GetRelativeErrorMinValue_25();
  public double GetRelativeErrorMinValue()
  {
    return GetRelativeErrorMinValue_25();
  }

  private native double GetRelativeErrorMaxValue_26();
  public double GetRelativeErrorMaxValue()
  {
    return GetRelativeErrorMaxValue_26();
  }

  private native double GetRelativeError_27();
  public double GetRelativeError()
  {
    return GetRelativeError_27();
  }

  private native void SetBoundaryVertexDeletion_28(int id0);
  public void SetBoundaryVertexDeletion(int id0)
  {
    SetBoundaryVertexDeletion_28(id0);
  }

  private native int GetBoundaryVertexDeletion_29();
  public int GetBoundaryVertexDeletion()
  {
    return GetBoundaryVertexDeletion_29();
  }

  private native void BoundaryVertexDeletionOn_30();
  public void BoundaryVertexDeletionOn()
  {
    BoundaryVertexDeletionOn_30();
  }

  private native void BoundaryVertexDeletionOff_31();
  public void BoundaryVertexDeletionOff()
  {
    BoundaryVertexDeletionOff_31();
  }

  private native void SetComputeNormals_32(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_32(id0);
  }

  private native int GetComputeNormals_33();
  public int GetComputeNormals()
  {
    return GetComputeNormals_33();
  }

  private native void ComputeNormalsOn_34();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_34();
  }

  private native void ComputeNormalsOff_35();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_35();
  }

  public vtkGreedyTerrainDecimation() { super(); }

  public vtkGreedyTerrainDecimation(long id) { super(id); }
  public native long   VTKInit();

}
