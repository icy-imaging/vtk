// java wrapper for vtkLinearSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinearSelector extends vtkSelectionAlgorithm
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

  private native void SetStartPoint_4(double id0,double id1,double id2);
  public void SetStartPoint(double id0,double id1,double id2)
  {
    SetStartPoint_4(id0,id1,id2);
  }

  private native void SetStartPoint_5(double id0[]);
  public void SetStartPoint(double id0[])
  {
    SetStartPoint_5(id0);
  }

  private native double[] GetStartPoint_6();
  public double[] GetStartPoint()
  {
    return GetStartPoint_6();
  }

  private native void SetEndPoint_7(double id0,double id1,double id2);
  public void SetEndPoint(double id0,double id1,double id2)
  {
    SetEndPoint_7(id0,id1,id2);
  }

  private native void SetEndPoint_8(double id0[]);
  public void SetEndPoint(double id0[])
  {
    SetEndPoint_8(id0);
  }

  private native double[] GetEndPoint_9();
  public double[] GetEndPoint()
  {
    return GetEndPoint_9();
  }

  private native void SetPoints_10(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_10(id0);
  }

  private native long GetPoints_11();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_11();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetTolerance_13();
  public double GetTolerance()
  {
    return GetTolerance_13();
  }

  private native void SetIncludeVertices_14(boolean id0);
  public void SetIncludeVertices(boolean id0)
  {
    SetIncludeVertices_14(id0);
  }

  private native boolean GetIncludeVertices_15();
  public boolean GetIncludeVertices()
  {
    return GetIncludeVertices_15();
  }

  private native void IncludeVerticesOn_16();
  public void IncludeVerticesOn()
  {
    IncludeVerticesOn_16();
  }

  private native void IncludeVerticesOff_17();
  public void IncludeVerticesOff()
  {
    IncludeVerticesOff_17();
  }

  private native void SetVertexEliminationTolerance_18(double id0);
  public void SetVertexEliminationTolerance(double id0)
  {
    SetVertexEliminationTolerance_18(id0);
  }

  private native double GetVertexEliminationToleranceMinValue_19();
  public double GetVertexEliminationToleranceMinValue()
  {
    return GetVertexEliminationToleranceMinValue_19();
  }

  private native double GetVertexEliminationToleranceMaxValue_20();
  public double GetVertexEliminationToleranceMaxValue()
  {
    return GetVertexEliminationToleranceMaxValue_20();
  }

  private native double GetVertexEliminationTolerance_21();
  public double GetVertexEliminationTolerance()
  {
    return GetVertexEliminationTolerance_21();
  }

  public vtkLinearSelector() { super(); }

  public vtkLinearSelector(long id) { super(id); }
  public native long   VTKInit();

}
