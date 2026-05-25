// java wrapper for vtkBoundedPointSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoundedPointSource extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfPoints_4(long id0);
  public void SetNumberOfPoints(long id0)
  {
    SetNumberOfPoints_4(id0);
  }

  private native long GetNumberOfPointsMinValue_5();
  public long GetNumberOfPointsMinValue()
  {
    return GetNumberOfPointsMinValue_5();
  }

  private native long GetNumberOfPointsMaxValue_6();
  public long GetNumberOfPointsMaxValue()
  {
    return GetNumberOfPointsMaxValue_6();
  }

  private native long GetNumberOfPoints_7();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_7();
  }

  private native void SetBounds_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_8(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_9(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_9(id0);
  }

  private native double[] GetBounds_10();
  public double[] GetBounds()
  {
    return GetBounds_10();
  }

  private native void SetOutputPointsPrecision_11(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_11(id0);
  }

  private native int GetOutputPointsPrecision_12();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_12();
  }

  private native void SetProduceCellOutput_13(boolean id0);
  public void SetProduceCellOutput(boolean id0)
  {
    SetProduceCellOutput_13(id0);
  }

  private native boolean GetProduceCellOutput_14();
  public boolean GetProduceCellOutput()
  {
    return GetProduceCellOutput_14();
  }

  private native void ProduceCellOutputOn_15();
  public void ProduceCellOutputOn()
  {
    ProduceCellOutputOn_15();
  }

  private native void ProduceCellOutputOff_16();
  public void ProduceCellOutputOff()
  {
    ProduceCellOutputOff_16();
  }

  private native void SetProduceRandomScalars_17(boolean id0);
  public void SetProduceRandomScalars(boolean id0)
  {
    SetProduceRandomScalars_17(id0);
  }

  private native boolean GetProduceRandomScalars_18();
  public boolean GetProduceRandomScalars()
  {
    return GetProduceRandomScalars_18();
  }

  private native void ProduceRandomScalarsOn_19();
  public void ProduceRandomScalarsOn()
  {
    ProduceRandomScalarsOn_19();
  }

  private native void ProduceRandomScalarsOff_20();
  public void ProduceRandomScalarsOff()
  {
    ProduceRandomScalarsOff_20();
  }

  private native void SetScalarRange_21(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_21(id0,id1);
  }

  private native void SetScalarRange_22(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_22(id0);
  }

  private native double[] GetScalarRange_23();
  public double[] GetScalarRange()
  {
    return GetScalarRange_23();
  }

  public vtkBoundedPointSource() { super(); }

  public vtkBoundedPointSource(long id) { super(id); }
  public native long   VTKInit();

}
