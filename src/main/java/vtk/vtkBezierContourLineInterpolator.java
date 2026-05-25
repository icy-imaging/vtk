// java wrapper for vtkBezierContourLineInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBezierContourLineInterpolator extends vtkContourLineInterpolator
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

  private native int InterpolateLine_4(vtkRenderer id0,vtkContourRepresentation id1,int id2,int id3);
  public int InterpolateLine(vtkRenderer id0,vtkContourRepresentation id1,int id2,int id3)
  {
    return InterpolateLine_4(id0,id1,id2,id3);
  }

  private native void SetMaximumCurveError_5(double id0);
  public void SetMaximumCurveError(double id0)
  {
    SetMaximumCurveError_5(id0);
  }

  private native double GetMaximumCurveErrorMinValue_6();
  public double GetMaximumCurveErrorMinValue()
  {
    return GetMaximumCurveErrorMinValue_6();
  }

  private native double GetMaximumCurveErrorMaxValue_7();
  public double GetMaximumCurveErrorMaxValue()
  {
    return GetMaximumCurveErrorMaxValue_7();
  }

  private native double GetMaximumCurveError_8();
  public double GetMaximumCurveError()
  {
    return GetMaximumCurveError_8();
  }

  private native void SetMaximumCurveLineSegments_9(int id0);
  public void SetMaximumCurveLineSegments(int id0)
  {
    SetMaximumCurveLineSegments_9(id0);
  }

  private native int GetMaximumCurveLineSegmentsMinValue_10();
  public int GetMaximumCurveLineSegmentsMinValue()
  {
    return GetMaximumCurveLineSegmentsMinValue_10();
  }

  private native int GetMaximumCurveLineSegmentsMaxValue_11();
  public int GetMaximumCurveLineSegmentsMaxValue()
  {
    return GetMaximumCurveLineSegmentsMaxValue_11();
  }

  private native int GetMaximumCurveLineSegments_12();
  public int GetMaximumCurveLineSegments()
  {
    return GetMaximumCurveLineSegments_12();
  }

  private native void GetSpan_13(int id0,vtkIntArray id1,vtkContourRepresentation id2);
  public void GetSpan(int id0,vtkIntArray id1,vtkContourRepresentation id2)
  {
    GetSpan_13(id0,id1,id2);
  }

  public vtkBezierContourLineInterpolator() { super(); }

  public vtkBezierContourLineInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
