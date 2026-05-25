// java wrapper for vtkGoldenBallSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGoldenBallSource extends vtkUnstructuredGridAlgorithm
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

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
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

  private native void SetResolution_11(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_11(id0);
  }

  private native int GetResolutionMinValue_12();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_12();
  }

  private native int GetResolutionMaxValue_13();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_13();
  }

  private native int GetResolution_14();
  public int GetResolution()
  {
    return GetResolution_14();
  }

  private native void SetIncludeCenterPoint_15(int id0);
  public void SetIncludeCenterPoint(int id0)
  {
    SetIncludeCenterPoint_15(id0);
  }

  private native int GetIncludeCenterPoint_16();
  public int GetIncludeCenterPoint()
  {
    return GetIncludeCenterPoint_16();
  }

  private native void IncludeCenterPointOn_17();
  public void IncludeCenterPointOn()
  {
    IncludeCenterPointOn_17();
  }

  private native void IncludeCenterPointOff_18();
  public void IncludeCenterPointOff()
  {
    IncludeCenterPointOff_18();
  }

  private native void SetGenerateNormals_19(int id0);
  public void SetGenerateNormals(int id0)
  {
    SetGenerateNormals_19(id0);
  }

  private native int GetGenerateNormals_20();
  public int GetGenerateNormals()
  {
    return GetGenerateNormals_20();
  }

  private native void GenerateNormalsOn_21();
  public void GenerateNormalsOn()
  {
    GenerateNormalsOn_21();
  }

  private native void GenerateNormalsOff_22();
  public void GenerateNormalsOff()
  {
    GenerateNormalsOff_22();
  }

  private native void SetOutputPointsPrecision_23(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_23(id0);
  }

  private native int GetOutputPointsPrecision_24();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_24();
  }

  public vtkGoldenBallSource() { super(); }

  public vtkGoldenBallSource(long id) { super(id); }
  public native long   VTKInit();

}
