// java wrapper for vtkRegularPolygonSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRegularPolygonSource extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfSides_4(int id0);
  public void SetNumberOfSides(int id0)
  {
    SetNumberOfSides_4(id0);
  }

  private native int GetNumberOfSidesMinValue_5();
  public int GetNumberOfSidesMinValue()
  {
    return GetNumberOfSidesMinValue_5();
  }

  private native int GetNumberOfSidesMaxValue_6();
  public int GetNumberOfSidesMaxValue()
  {
    return GetNumberOfSidesMaxValue_6();
  }

  private native int GetNumberOfSides_7();
  public int GetNumberOfSides()
  {
    return GetNumberOfSides_7();
  }

  private native void SetCenter_8(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_8(id0,id1,id2);
  }

  private native void SetCenter_9(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_9(id0);
  }

  private native double[] GetCenter_10();
  public double[] GetCenter()
  {
    return GetCenter_10();
  }

  private native void SetNormal_11(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_11(id0,id1,id2);
  }

  private native void SetNormal_12(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_12(id0);
  }

  private native double[] GetNormal_13();
  public double[] GetNormal()
  {
    return GetNormal_13();
  }

  private native void SetRadius_14(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_14(id0);
  }

  private native double GetRadius_15();
  public double GetRadius()
  {
    return GetRadius_15();
  }

  private native void SetGeneratePolygon_16(int id0);
  public void SetGeneratePolygon(int id0)
  {
    SetGeneratePolygon_16(id0);
  }

  private native int GetGeneratePolygon_17();
  public int GetGeneratePolygon()
  {
    return GetGeneratePolygon_17();
  }

  private native void GeneratePolygonOn_18();
  public void GeneratePolygonOn()
  {
    GeneratePolygonOn_18();
  }

  private native void GeneratePolygonOff_19();
  public void GeneratePolygonOff()
  {
    GeneratePolygonOff_19();
  }

  private native void SetGeneratePolyline_20(int id0);
  public void SetGeneratePolyline(int id0)
  {
    SetGeneratePolyline_20(id0);
  }

  private native int GetGeneratePolyline_21();
  public int GetGeneratePolyline()
  {
    return GetGeneratePolyline_21();
  }

  private native void GeneratePolylineOn_22();
  public void GeneratePolylineOn()
  {
    GeneratePolylineOn_22();
  }

  private native void GeneratePolylineOff_23();
  public void GeneratePolylineOff()
  {
    GeneratePolylineOff_23();
  }

  private native void SetOutputPointsPrecision_24(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_24(id0);
  }

  private native int GetOutputPointsPrecision_25();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_25();
  }

  public vtkRegularPolygonSource() { super(); }

  public vtkRegularPolygonSource(long id) { super(id); }
  public native long   VTKInit();

}
